package TCC.tcc.DTO;

import TCC.tcc.Model.UserRole;

public record LoginResponseDTO(String token, UserRole role) {
}
