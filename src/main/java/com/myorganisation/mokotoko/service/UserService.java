package com.myorganisation.mokotoko.service;

import com.myorganisation.mokotoko.dto.UserRequestDTO;
import com.myorganisation.mokotoko.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO registerUser(UserRequestDTO userRequestDTO);
    UserResponseDTO getUser(Long id);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO updateUser(Long id , UserRequestDTO userRequestDTO);
    String removeUser(Long id);




}
