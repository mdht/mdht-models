/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage
 * @generated
 */
public interface EyeFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EyeFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.ihe.eye.impl.EyeFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Ocular List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocular List Of Surgeries Section</em>'.
	 * @generated
	 */
	OcularListOfSurgeriesSection createOcularListOfSurgeriesSection();

		/**
	 * Returns a new object of class '<em>Ocular Coded List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocular Coded List Of Surgeries Section</em>'.
	 * @generated
	 */
	OcularCodedListOfSurgeriesSection createOcularCodedListOfSurgeriesSection();

		/**
	 * Returns a new object of class '<em>Ocular History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocular History Section</em>'.
	 * @generated
	 */
	OcularHistorySection createOcularHistorySection();

		/**
	 * Returns a new object of class '<em>Ophthalmic Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ophthalmic Medications Section</em>'.
	 * @generated
	 */
	OphthalmicMedicationsSection createOphthalmicMedicationsSection();

		/**
	 * Returns a new object of class '<em>Routine Eye Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Eye Exam Section</em>'.
	 * @generated
	 */
	RoutineEyeExamSection createRoutineEyeExamSection();

		/**
	 * Returns a new object of class '<em>Ocular Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocular Physical Exam Section</em>'.
	 * @generated
	 */
	OcularPhysicalExamSection createOcularPhysicalExamSection();

		/**
	 * Returns a new object of class '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Eye Evaluation</em>'.
	 * @generated
	 */
	GeneralEyeEvaluation createGeneralEyeEvaluation();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EyePackage getEyePackage();

} //EyeFactory
