/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.EyesSection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage
 * @generated
 */
public class EyeSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EyePackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EyeSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EyePackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

		/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
		protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case EyePackage.OCULAR_LIST_OF_SURGERIES_SECTION: {
				OcularListOfSurgeriesSection ocularListOfSurgeriesSection = (OcularListOfSurgeriesSection)theEObject;
				T result = caseOcularListOfSurgeriesSection(ocularListOfSurgeriesSection);
				if (result == null) result = caseSurgeriesSection(ocularListOfSurgeriesSection);
				if (result == null) result = caseProceduresSection(ocularListOfSurgeriesSection);
				if (result == null) result = caseSection(ocularListOfSurgeriesSection);
				if (result == null) result = caseAct(ocularListOfSurgeriesSection);
				if (result == null) result = caseInfrastructureRoot(ocularListOfSurgeriesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EyePackage.OCULAR_CODED_LIST_OF_SURGERIES_SECTION: {
				OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection = (OcularCodedListOfSurgeriesSection)theEObject;
				T result = caseOcularCodedListOfSurgeriesSection(ocularCodedListOfSurgeriesSection);
				if (result == null) result = caseCodedSurgeriesSection(ocularCodedListOfSurgeriesSection);
				if (result == null) result = caseSurgeriesSection(ocularCodedListOfSurgeriesSection);
				if (result == null) result = caseProceduresSection(ocularCodedListOfSurgeriesSection);
				if (result == null) result = caseSection(ocularCodedListOfSurgeriesSection);
				if (result == null) result = caseAct(ocularCodedListOfSurgeriesSection);
				if (result == null) result = caseInfrastructureRoot(ocularCodedListOfSurgeriesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EyePackage.OCULAR_HISTORY_SECTION: {
				OcularHistorySection ocularHistorySection = (OcularHistorySection)theEObject;
				T result = caseOcularHistorySection(ocularHistorySection);
				if (result == null) result = caseHistoryOfPastIllnessSection(ocularHistorySection);
				if (result == null) result = caseSection(ocularHistorySection);
				if (result == null) result = caseAct(ocularHistorySection);
				if (result == null) result = caseInfrastructureRoot(ocularHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EyePackage.OPHTHALMIC_MEDICATIONS_SECTION: {
				OphthalmicMedicationsSection ophthalmicMedicationsSection = (OphthalmicMedicationsSection)theEObject;
				T result = caseOphthalmicMedicationsSection(ophthalmicMedicationsSection);
				if (result == null) result = caseIHE_MedicationsSection(ophthalmicMedicationsSection);
				if (result == null) result = caseMedicationsSection(ophthalmicMedicationsSection);
				if (result == null) result = caseSection(ophthalmicMedicationsSection);
				if (result == null) result = caseAct(ophthalmicMedicationsSection);
				if (result == null) result = caseInfrastructureRoot(ophthalmicMedicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EyePackage.ROUTINE_EYE_EXAM_SECTION: {
				RoutineEyeExamSection routineEyeExamSection = (RoutineEyeExamSection)theEObject;
				T result = caseRoutineEyeExamSection(routineEyeExamSection);
				if (result == null) result = caseEyesSection(routineEyeExamSection);
				if (result == null) result = caseSection(routineEyeExamSection);
				if (result == null) result = caseAct(routineEyeExamSection);
				if (result == null) result = caseInfrastructureRoot(routineEyeExamSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EyePackage.OCULAR_PHYSICAL_EXAM_SECTION: {
				OcularPhysicalExamSection ocularPhysicalExamSection = (OcularPhysicalExamSection)theEObject;
				T result = caseOcularPhysicalExamSection(ocularPhysicalExamSection);
				if (result == null) result = casePhysicalExamSection(ocularPhysicalExamSection);
				if (result == null) result = casePhysicalExamNarrativeSection(ocularPhysicalExamSection);
				if (result == null) result = caseSection(ocularPhysicalExamSection);
				if (result == null) result = caseAct(ocularPhysicalExamSection);
				if (result == null) result = caseInfrastructureRoot(ocularPhysicalExamSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EyePackage.GENERAL_EYE_EVALUATION: {
				GeneralEyeEvaluation generalEyeEvaluation = (GeneralEyeEvaluation)theEObject;
				T result = caseGeneralEyeEvaluation(generalEyeEvaluation);
				if (result == null) result = caseClinicalDocument(generalEyeEvaluation);
				if (result == null) result = caseAct(generalEyeEvaluation);
				if (result == null) result = caseInfrastructureRoot(generalEyeEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Ocular List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocular List Of Surgeries Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOcularListOfSurgeriesSection(OcularListOfSurgeriesSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocular Coded List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocular Coded List Of Surgeries Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOcularCodedListOfSurgeriesSection(OcularCodedListOfSurgeriesSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocular History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocular History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOcularHistorySection(OcularHistorySection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Ophthalmic Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ophthalmic Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOphthalmicMedicationsSection(OphthalmicMedicationsSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Routine Eye Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routine Eye Exam Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutineEyeExamSection(RoutineEyeExamSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocular Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocular Physical Exam Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOcularPhysicalExamSection(OcularPhysicalExamSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Eye Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralEyeEvaluation(GeneralEyeEvaluation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInfrastructureRoot(InfrastructureRoot object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAct(Act object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSection(ProceduresSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgeriesSection(SurgeriesSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coded Surgeries Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodedSurgeriesSection(CodedSurgeriesSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSection(MedicationsSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_MedicationsSection(org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Eyes Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eyes Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEyesSection(EyesSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExamNarrativeSection(PhysicalExamNarrativeSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExamSection(PhysicalExamSection object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseClinicalDocument(ClinicalDocument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
		public T defaultCase(EObject object)
  {
		return null;
	}

} //EyeSwitch
