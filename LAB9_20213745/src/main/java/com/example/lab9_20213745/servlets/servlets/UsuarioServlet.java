package com.example.lab9_20213745.servlets.servlets;


import com.example.lab9_20213745.servlets.daos.DaoUsuarios;
import com.example.lab9_20213745.servlets.dtos.usuariosDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "usuarios-servlet", value = "/listaUsuarios")
public class UsuarioServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String action = request.getParameter("action");
        DaoUsuarios usuariosDao = new DaoUsuarios();

        switch (action) {
            case "listar":


                ArrayList<usuariosDTO> listaUsuarios = usuariosDao.obtenerListaUsuarios();
                request.setAttribute("listaUsuarios", listaUsuarios);

                RequestDispatcher view = request.getRequestDispatcher("listaUsuarios.jsp");
                view.forward(request,response);
                break;

        }


    }


}

