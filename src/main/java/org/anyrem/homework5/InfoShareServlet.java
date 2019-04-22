package org.anyrem.homework5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.*;

@WebServlet("/infoShareAcademy")

public class InfoShareServlet extends HttpServlet {

    static ArrayList<String> passedParams = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Enumeration pn = req.getParameterNames();
        while (pn.hasMoreElements()) {
                Object objOri=pn.nextElement();
                passedParams.add(objOri+"="+req.getParameter((String)objOri));
        }

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html><html><body>");
        writer.println("LISTA PARZESŁANYCH PARAMETRÓW:<br>");
        for (String passedParam : passedParams) {
            writer.println(passedParam+"<br>");
        }
        writer.println("</body></html><br>");
        writer.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Enumeration pn = req.getParameterNames();
        while (pn.hasMoreElements()) {
            Object objOri=pn.nextElement();
            passedParams.add(objOri+"="+req.getParameter((String)objOri));
        }

        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html><html><body><br>");
        writer.println("Remik Anyż<br>");
        writer.println("jjdd6-remik<br>");
        writer.println(LocalDateTime.now()+"<br>");
        writer.println("</body></html><br>");
        writer.close();
    }
}
