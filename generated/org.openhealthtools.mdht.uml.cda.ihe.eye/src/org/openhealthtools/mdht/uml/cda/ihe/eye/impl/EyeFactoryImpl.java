/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.ihe.eye.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EyeFactoryImpl extends EFactoryImpl implements EyeFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EyeFactory init()
  {
		try {
			EyeFactory theEyeFactory = (EyeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe/eye"); 
			if (theEyeFactory != null) {
				return theEyeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EyeFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EyeFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case EyePackage.OCULAR_LIST_OF_SURGERIES_SECTION: return createOcularListOfSurgeriesSection();
			case EyePackage.OCULAR_CODED_LIST_OF_SURGERIES_SECTION: return createOcularCodedListOfSurgeriesSection();
			case EyePackage.OCULAR_HISTORY_SECTION: return createOcularHistorySection();
			case EyePackage.OPHTHALMIC_MEDICATIONS_SECTION: return createOphthalmicMedicationsSection();
			case EyePackage.ROUTINE_EYE_EXAM_SECTION: return createRoutineEyeExamSection();
			case EyePackage.OCULAR_PHYSICAL_EXAM_SECTION: return createOcularPhysicalExamSection();
			case EyePackage.GENERAL_EYE_EVALUATION: return createGeneralEyeEvaluation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcularListOfSurgeriesSection createOcularListOfSurgeriesSection() {
		OcularListOfSurgeriesSectionImpl ocularListOfSurgeriesSection = new OcularListOfSurgeriesSectionImpl();
		return ocularListOfSurgeriesSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcularCodedListOfSurgeriesSection createOcularCodedListOfSurgeriesSection() {
		OcularCodedListOfSurgeriesSectionImpl ocularCodedListOfSurgeriesSection = new OcularCodedListOfSurgeriesSectionImpl();
		return ocularCodedListOfSurgeriesSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcularHistorySection createOcularHistorySection() {
		OcularHistorySectionImpl ocularHistorySection = new OcularHistorySectionImpl();
		return ocularHistorySection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OphthalmicMedicationsSection createOphthalmicMedicationsSection() {
		OphthalmicMedicationsSectionImpl ophthalmicMedicationsSection = new OphthalmicMedicationsSectionImpl();
		return ophthalmicMedicationsSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineEyeExamSection createRoutineEyeExamSection() {
		RoutineEyeExamSectionImpl routineEyeExamSection = new RoutineEyeExamSectionImpl();
		return routineEyeExamSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcularPhysicalExamSection createOcularPhysicalExamSection() {
		OcularPhysicalExamSectionImpl ocularPhysicalExamSection = new OcularPhysicalExamSectionImpl();
		return ocularPhysicalExamSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralEyeEvaluation createGeneralEyeEvaluation() {
		GeneralEyeEvaluationImpl generalEyeEvaluation = new GeneralEyeEvaluationImpl();
		return generalEyeEvaluation;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EyePackage getEyePackage()
  {
		return (EyePackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EyePackage getPackage()
  {
		return EyePackage.eINSTANCE;
	}

} //EyeFactoryImpl
