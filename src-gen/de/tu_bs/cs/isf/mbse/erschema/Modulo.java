/**
 */
package de.tu_bs.cs.isf.mbse.erschema;

import java.lang.Double;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.erschema.Modulo#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends ArithmeticOperator {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see de.tu_bs.cs.isf.mbse.erschema.ErschemaPackage#getModulo_Value()
	 * @model default="0"
	 * @generated
	 */
	EList<Double> getValue();
} // Modulo
