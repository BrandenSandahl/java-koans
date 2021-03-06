package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

public class AboutEquality {

	@Koan
	public void doubleEqualsTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		Object sameObject = object;
		assertEquals(object == sameObject, sameObject == object);
		assertEquals(object == new Object(), sameObject == new Object());
	}

	@Koan
	public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		assertEquals(object.equals(object), object.equals(object));
		assertEquals(object.equals(new Object()), object.equals(new Object()));
	}

	@Koan
	public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual(){
		Object object = new Integer(1);
		assertEquals(object.equals(object), object.equals(object));
		assertEquals(object.equals(new Integer(1)), object.equals(new Integer(1)));
		// Note: This means that for the class 'Object' there is no difference between 'equal' and 'same'
	}

	@Koan
	public void objectsNeverEqualNull(){
		assertEquals(new Object().equals(null), new Object().equals(null));
	}

	@Koan
	public void objectsEqualThemselves(){
		Object obj = new Object();
		assertEquals(obj.equals(obj), obj.equals(obj));
	}
}
