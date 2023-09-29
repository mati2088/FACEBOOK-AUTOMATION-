package pages;

import org.openqa.selenium.By;
import parallel.elements.WebElementParallel;

public class LoginPage {

    private String titulo = "";
    private String campoPassword = "";
    private String CampoUsuario = "";

    private String botonIniciarSesion = "";

    public WebElementParallel getTitulo(){return new WebElementParallel(By.xpath(titulo));}

    public WebElementParallel getCampoPassword(){return new WebElementParallel(By.xpath(campoPassword));}

    public WebElementParallel getBotonIniciarSesion(){return new WebElementParallel(By.xpath(botonIniciarSesion));}

    public WebElementParallel getCampoUsuario(){return new WebElementParallel(By.xpath(CampoUsuario));}



}
