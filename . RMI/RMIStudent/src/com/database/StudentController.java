package com.database;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentController extends UnicastRemoteObject implements Student {
    public StudentController() throws RemoteException {
        super();
    }

    @Override
    public String viewStudents() throws RemoteException {
        Connection connection = DatabaseConnect.getConnection();
        System.out.println(connection);
        String query = "SELECT * FROM basicdata WHERE stu_address = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Hambantota");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                return resultSet.getString("stu_name");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
