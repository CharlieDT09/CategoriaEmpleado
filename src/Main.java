import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Empleado empleado = new Empleado();

        System.out.print("Ingrese el código del empleado (3 cifras): ");
        empleado.setCodigo(Integer.parseInt(br.readLine()));

        if (empleado.codigoValido())
        {
            System.out.println("Código: " + empleado.getCodigo());
            System.out.println("Categoría: " + empleado.obtenerCategoria());
        }
        else
        {
            System.out.println("Error: el código debe tener exactamente 3 cifras.");
        }
    }
}