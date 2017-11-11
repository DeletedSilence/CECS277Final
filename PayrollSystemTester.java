/**
 * 
 * @author Jose Ramirez
 * CECS 277
 * 014411356
 * 11/13/17
 *
 */
public class PayrollSystemTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
		HourlyEmployee hourlyEmployee = new HourlyEmployee( "Karen", "Price", "222-22-2222",16.75, 40 );
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones","333-33-3333", 10000, .06 );
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
		PieceWorker pieceworkerEmployee = new PieceWorker("Mike","Solo","777-77-777",20.00,30);
		System.out.println( "Employees processed individually:\n" );
		System.out.printf( "%s\n%s: $%,.2f\n\n",salariedEmployee, "earned",salariedEmployee.getPaymentAmount() );
		System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned",hourlyEmployee.getPaymentAmount() );
		System.out.printf( "%s\n%s: $%,.2f\n\n", commissionEmployee, "earned",commissionEmployee.getPaymentAmount() );
		System.out.printf( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned",basePlusCommissionEmployee.getPaymentAmount() );*/
		Payable[] payableObjects = new Payable[6];//array of payable objects
		payableObjects[0] = new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
		payableObjects[1] = new HourlyEmployee( "Karen", "Price", "222-22-2222",16.75, 40 );
		payableObjects[2] = new CommissionEmployee("Sue", "Jones","333-33-3333", 10000, .06 );
		payableObjects[3]= new BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
		//payableObjects[4]= pieceworkerEmployee;
		payableObjects[4] = new Invoice( "01234", "seat", 2, 375.00 );
		payableObjects[5] = new Invoice( "56789", "tire", 4, 79.95 );
		System.out.println("\nInvoices and Employees processed polymorphically:\n" );
		for ( Payable currentObject : payableObjects ){//prints contents of payableObjects array
			if(currentObject instanceof Invoice){
				System.out.printf( "%s \n%s: $%,.2f\n\n",currentObject.toString(),"payment due", currentObject.getPaymentAmount());
			}
			else if(currentObject instanceof Employee){
				System.out.println(currentObject);
				if(currentObject instanceof BasePlusCommissionEmployee){
					BasePlusCommissionEmployee b = (BasePlusCommissionEmployee)currentObject;
					double os = b.getSalary();
					b.setSalary(1.1*os);
					System.out.print("New base salary with a 10% increase: ");
					System.out.printf( "$%,.2f\n", b.getSalary());
				}
					System.out.printf("Employee earnings: $%,.2f%n", currentObject.getPaymentAmount());
					System.out.println("");
			}
		}

	}


}
