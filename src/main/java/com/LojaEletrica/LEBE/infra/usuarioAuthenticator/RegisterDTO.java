package com.LojaEletrica.LEBE.infra.usuarioAuthenticator;

import com.LojaEletrica.LEBE.entities.enums.UserRoles;

public record RegisterDTO(String apelido, String senha, UserRoles papel) {

}
