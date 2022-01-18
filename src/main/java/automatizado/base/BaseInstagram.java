package automatizado.base;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import java.io.IOException;


public abstract class BaseInstagram extends Base {
    @Override
    public String getBaseUrl() {
        return "https://www.instagram.com/";
    }

    @Override
    public String getUsuario() {
        return "javaautoma";
    }

    @Override
    public String getSenha() {
        return "creu123";
    }

}