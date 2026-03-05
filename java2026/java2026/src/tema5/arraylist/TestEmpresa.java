package tema5.arraylist;

public class TestEmpresa {
    public static void main(String[] args) {

        Empresa cosentino = new Empresa("Cosentino SA");

        //Crear objetos Empleado y añadirlos a la Empresa
        Empleado emp1 = new Empleado("Manuel", "García Minguillán",
                33, 2200.0,"mgin@cosentino.es", "656555889",
                Empleado.Departamento.TI);
        Empleado emp2 = new Empleado("Ana Silvia", "Fernández",
                35, 2500.0,"asilv@cosentino.es", "998855665",
                Empleado.Departamento.RRHH);

        cosentino.addEmpleado(emp1);
        cosentino.addEmpleado(emp2);

        System.out.println(cosentino);

        cosentino.removeEmpleado(emp1);

        System.out.println(cosentino);

    }
}
