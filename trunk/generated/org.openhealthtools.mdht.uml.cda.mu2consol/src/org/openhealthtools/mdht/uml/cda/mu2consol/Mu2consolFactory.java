/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public interface Mu2consolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mu2consolFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
	 * Returns a new object of class '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Summary Of Care Record</em>'.
	 * @generated
	 */
	SummaryOfCareRecord createSummaryOfCareRecord();

	/**
	 * Returns a new object of class '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDT Ambulatory Patient Info</em>'.
	 * @generated
	 */
	VDTAmbulatoryPatientInfo createVDTAmbulatoryPatientInfo();

	/**
	 * Returns a new object of class '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Office Visit Summary</em>'.
	 * @generated
	 */
	ClinicalOfficeVisitSummary createClinicalOfficeVisitSummary();

	/**
	 * Returns a new object of class '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDT Inpatient Patient Info</em>'.
	 * @generated
	 */
	VDTInpatientPatientInfo createVDTInpatientPatientInfo();

	/**
	 * Returns a new object of class '<em>Create Transmit Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Transmit Summary Of Care Record</em>'.
	 * @generated
	 */
	CreateTransmitSummaryOfCareRecord createCreateTransmitSummaryOfCareRecord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Mu2consolPackage getMu2consolPackage();

} //Mu2consolFactory
