/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.CONSOLPackage
 * @generated
 */
public interface CONSOLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CONSOLFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.consol.impl.CONSOLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CONSOLPackage getCONSOLPackage();

} //CONSOLFactory
