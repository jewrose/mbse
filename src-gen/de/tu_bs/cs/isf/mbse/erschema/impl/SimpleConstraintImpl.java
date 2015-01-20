/**
 */
package de.tu_bs.cs.isf.mbse.erschema.impl;

import de.tu_bs.cs.isf.mbse.erschema.ArithmeticOperator;
import de.tu_bs.cs.isf.mbse.erschema.Attribute;
import de.tu_bs.cs.isf.mbse.erschema.Comparative;
import de.tu_bs.cs.isf.mbse.erschema.Connective;
import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage;
import de.tu_bs.cs.isf.mbse.erschema.SimpleConstraint;
import de.tu_bs.cs.isf.mbse.erschema.StringOperator;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getCompare <em>Compare</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getStringop <em>Stringop</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.impl.SimpleConstraintImpl#getArithmeticop <em>Arithmeticop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleConstraintImpl extends MinimalEObjectImpl.Container implements SimpleConstraint {
	/**
	 * The cached value of the '{@link #getCompare() <em>Compare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparative> compare;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected EList<Connective> connect;

	/**
	 * The cached value of the '{@link #getStringop() <em>Stringop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringop()
	 * @generated
	 * @ordered
	 */
	protected EList<StringOperator> stringop;

	/**
	 * The cached value of the '{@link #getArithmeticop() <em>Arithmeticop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticop()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticOperator> arithmeticop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErschemaPackage.Literals.SIMPLE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comparative> getCompare() {
		if (compare == null) {
			compare = new EObjectContainmentEList<Comparative>(Comparative.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE);
		}
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectResolvingEList<Entity>(Entity.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connective> getConnect() {
		if (connect == null) {
			connect = new EObjectContainmentEList<Connective>(Connective.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__CONNECT);
		}
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringOperator> getStringop() {
		if (stringop == null) {
			stringop = new EObjectContainmentEList<StringOperator>(StringOperator.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__STRINGOP);
		}
		return stringop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticOperator> getArithmeticop() {
		if (arithmeticop == null) {
			arithmeticop = new EObjectContainmentEList<ArithmeticOperator>(ArithmeticOperator.class, this, ErschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP);
		}
		return arithmeticop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return ((InternalEList<?>)getCompare()).basicRemove(otherEnd, msgs);
			case ErschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				return ((InternalEList<?>)getConnect()).basicRemove(otherEnd, msgs);
			case ErschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				return ((InternalEList<?>)getStringop()).basicRemove(otherEnd, msgs);
			case ErschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				return ((InternalEList<?>)getArithmeticop()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return getCompare();
			case ErschemaPackage.SIMPLE_CONSTRAINT__ENTITY:
				return getEntity();
			case ErschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				return getAttributes();
			case ErschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				return getConnect();
			case ErschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				return getStringop();
			case ErschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				return getArithmeticop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				getCompare().clear();
				getCompare().addAll((Collection<? extends Comparative>)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				getConnect().clear();
				getConnect().addAll((Collection<? extends Connective>)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				getStringop().clear();
				getStringop().addAll((Collection<? extends StringOperator>)newValue);
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				getArithmeticop().clear();
				getArithmeticop().addAll((Collection<? extends ArithmeticOperator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				getCompare().clear();
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__ENTITY:
				getEntity().clear();
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				getConnect().clear();
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				getStringop().clear();
				return;
			case ErschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				getArithmeticop().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ErschemaPackage.SIMPLE_CONSTRAINT__COMPARE:
				return compare != null && !compare.isEmpty();
			case ErschemaPackage.SIMPLE_CONSTRAINT__ENTITY:
				return entity != null && !entity.isEmpty();
			case ErschemaPackage.SIMPLE_CONSTRAINT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ErschemaPackage.SIMPLE_CONSTRAINT__CONNECT:
				return connect != null && !connect.isEmpty();
			case ErschemaPackage.SIMPLE_CONSTRAINT__STRINGOP:
				return stringop != null && !stringop.isEmpty();
			case ErschemaPackage.SIMPLE_CONSTRAINT__ARITHMETICOP:
				return arithmeticop != null && !arithmeticop.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleConstraintImpl
