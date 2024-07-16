package fc.ms.forohub.domain.usuario.validaciones;


import fc.ms.forohub.domain.usuario.RegistroUsuarioDTO;

public interface ValidadorDeUsuario {

    public void validate(RegistroUsuarioDTO RegistroUsuarioDTO);
}