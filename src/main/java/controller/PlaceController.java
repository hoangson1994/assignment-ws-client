package controller;

import mypackage.MyService;
import mypackage.MyServiceServiceLocator;
import mypackage.Place;
import mypackage.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaceController extends HttpServlet {

    private static MyServiceServiceLocator locator = new MyServiceServiceLocator();
    private static MyService service;

    static {
        try {
            if (service == null) {
                service = locator.getMyServicePort();
            }
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("/create-place".equalsIgnoreCase(req.getRequestURI())) {
            req.getRequestDispatcher("/create-place.jsp").forward(req, resp);
        } else {
            Place[] places = service.getListplace();
            req.setAttribute("places", places);
            req.getRequestDispatcher("/list-place.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String image = req.getParameter("image");
        String name = req.getParameter("name");
        String province = req.getParameter("province");
        String district = req.getParameter("district");
        String information = req.getParameter("information");
        String rate = req.getParameter("rate");
        Place place = new Place();

        place.setImage(image);
        place.setName(name);
        place.setProvince(province);
        place.setDistrict(district);
        place.setInformation(information);
        service.createPlace(place);
        if (place == null) {
            resp.sendError(400, "Bad request");
        } else {
            resp.getWriter().println("okie");
        }
    }
}
