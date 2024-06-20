package com.example.lab9_20213745.servlets.daos;

import com.example.lab9_20213745.servlets.dtos.usuariosDTO;

import java.sql.*;
import java.util.ArrayList;

public class DaoUsuarios extends DaoBase {
    public ArrayList<usuariosDTO> obtenerListaUsuarios() {
        ArrayList<usuariosDTO> usuarios = new ArrayList<>();
        String query = "SELECT usuario.idusuario, usuario.nombres, usuario.apellidos ,licencia.categoria,licencia.fecha_emision,licencia.fecha_caducidad , pais.nombre_pais " +
                "FROM usuario JOIN licencia JOIN pais ON usuario.licencia_idlicencia = licencia.idlicencia and licencia.pais_idpais = pais.idpais";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                usuariosDTO usuario = new usuariosDTO();
                usuario.setIdUsuario(rs.getInt("idusuario"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setLicencia_categoria(rs.getString("categoria"));
                usuario.setLicencia_fecha_emision(rs.getString("fecha de emision"));
                usuario.setLicencia_fecha_emision(rs.getString("fecha de caducidad"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setNombre_pais(rs.getString("pais"));

                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }
}




