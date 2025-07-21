package TCC.tcc.DTO;

import TCC.tcc.Model.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}