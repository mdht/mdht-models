/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.mu2consol.*;

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
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public class Mu2consolSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mu2consolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mu2consolSwitch() {
		if (modelPackage == null) {
			modelPackage = Mu2consolPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS: {
				GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints)theEObject;
				T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
				if (result == null) result = caseClinicalDocument(generalHeaderConstraints);
				if (result == null) result = caseAct(generalHeaderConstraints);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mu2consolPackage.SUMMARY_OF_CARE_RECORD: {
				SummaryOfCareRecord summaryOfCareRecord = (SummaryOfCareRecord)theEObject;
				T result = caseSummaryOfCareRecord(summaryOfCareRecord);
				if (result == null) result = caseGeneralHeaderConstraints(summaryOfCareRecord);
				if (result == null) result = caseClinicalDocument(summaryOfCareRecord);
				if (result == null) result = caseAct(summaryOfCareRecord);
				if (result == null) result = caseInfrastructureRoot(summaryOfCareRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mu2consolPackage.VDT_AMBULATORY_PATIENT_INFO: {
				VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo = (VDTAmbulatoryPatientInfo)theEObject;
				T result = caseVDTAmbulatoryPatientInfo(vdtAmbulatoryPatientInfo);
				if (result == null) result = caseGeneralHeaderConstraints(vdtAmbulatoryPatientInfo);
				if (result == null) result = caseClinicalDocument(vdtAmbulatoryPatientInfo);
				if (result == null) result = caseAct(vdtAmbulatoryPatientInfo);
				if (result == null) result = caseInfrastructureRoot(vdtAmbulatoryPatientInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mu2consolPackage.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD: {
				CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord = (CreateTransmitSummaryOfCareRecord)theEObject;
				T result = caseCreateTransmitSummaryOfCareRecord(createTransmitSummaryOfCareRecord);
				if (result == null) result = caseGeneralHeaderConstraints(createTransmitSummaryOfCareRecord);
				if (result == null) result = caseClinicalDocument(createTransmitSummaryOfCareRecord);
				if (result == null) result = caseAct(createTransmitSummaryOfCareRecord);
				if (result == null) result = caseInfrastructureRoot(createTransmitSummaryOfCareRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mu2consolPackage.VDT_INPATIENT_PATIENT_INFO: {
				VDTInpatientPatientInfo vdtInpatientPatientInfo = (VDTInpatientPatientInfo)theEObject;
				T result = caseVDTInpatientPatientInfo(vdtInpatientPatientInfo);
				if (result == null) result = caseGeneralHeaderConstraints(vdtInpatientPatientInfo);
				if (result == null) result = caseClinicalDocument(vdtInpatientPatientInfo);
				if (result == null) result = caseAct(vdtInpatientPatientInfo);
				if (result == null) result = caseInfrastructureRoot(vdtInpatientPatientInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY: {
				ClinicalOfficeVisitSummary clinicalOfficeVisitSummary = (ClinicalOfficeVisitSummary)theEObject;
				T result = caseClinicalOfficeVisitSummary(clinicalOfficeVisitSummary);
				if (result == null) result = caseGeneralHeaderConstraints(clinicalOfficeVisitSummary);
				if (result == null) result = caseClinicalDocument(clinicalOfficeVisitSummary);
				if (result == null) result = caseAct(clinicalOfficeVisitSummary);
				if (result == null) result = caseInfrastructureRoot(clinicalOfficeVisitSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Summary Of Care Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummaryOfCareRecord(SummaryOfCareRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDT Ambulatory Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDT Ambulatory Patient Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDTAmbulatoryPatientInfo(VDTAmbulatoryPatientInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Office Visit Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Office Visit Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalOfficeVisitSummary(ClinicalOfficeVisitSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDT Inpatient Patient Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDT Inpatient Patient Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDTInpatientPatientInfo(VDTInpatientPatientInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Transmit Summary Of Care Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Transmit Summary Of Care Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTransmitSummaryOfCareRecord(CreateTransmitSummaryOfCareRecord object) {
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
	public T caseInfrastructureRoot(InfrastructureRoot object) {
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
	public T caseAct(Act object) {
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
	public T caseClinicalDocument(ClinicalDocument object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //Mu2consolSwitch
