package com.LojaEletrica.LEBE.entities.enums;

public enum UserRoles {
	
	ADMIN("admin"),
	USER("user");
	
    private String papel;

    UserRoles(String papel){
        this.papel = papel;
    }

    public String getPapel(){
        return papel;
    }
}
