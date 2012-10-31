/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.*;

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
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage
 * @generated
 */
public class QrphSwitch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static QrphPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public QrphSwitch()
  {
		if (modelPackage == null) {
			modelPackage = QrphPackage.eINSTANCE;
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  public T doSwitch(EObject theEObject)
  {
		return doSwitch(theEObject.eClass(), theEObject);
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case QrphPackage.EARLY_HEARING_CARE_PLAN_DOCUMENT: {
				EarlyHearingCarePlanDocument earlyHearingCarePlanDocument = (EarlyHearingCarePlanDocument)theEObject;
				T result = caseEarlyHearingCarePlanDocument(earlyHearingCarePlanDocument);
				if (result == null) result = caseMedicalDocument(earlyHearingCarePlanDocument);
				if (result == null) result = caseGeneralHeaderConstraints(earlyHearingCarePlanDocument);
				if (result == null) result = caseClinicalDocument(earlyHearingCarePlanDocument);
				if (result == null) result = caseAct(earlyHearingCarePlanDocument);
				if (result == null) result = caseInfrastructureRoot(earlyHearingCarePlanDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QrphPackage.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION: {
				RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection = (RiskIndicatorsForHearingLossSection)theEObject;
				T result = caseRiskIndicatorsForHearingLossSection(riskIndicatorsForHearingLossSection);
				if (result == null) result = caseSection(riskIndicatorsForHearingLossSection);
				if (result == null) result = caseAct(riskIndicatorsForHearingLossSection);
				if (result == null) result = caseInfrastructureRoot(riskIndicatorsForHearingLossSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QrphPackage.HEARING_SCREENING_CODED_RESULTS_SECTION: {
				HearingScreeningCodedResultsSection hearingScreeningCodedResultsSection = (HearingScreeningCodedResultsSection)theEObject;
				T result = caseHearingScreeningCodedResultsSection(hearingScreeningCodedResultsSection);
				if (result == null) result = caseCodedResultsSection(hearingScreeningCodedResultsSection);
				if (result == null) result = caseSection(hearingScreeningCodedResultsSection);
				if (result == null) result = caseAct(hearingScreeningCodedResultsSection);
				if (result == null) result = caseInfrastructureRoot(hearingScreeningCodedResultsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Early Hearing Care Plan Document</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Early Hearing Care Plan Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEarlyHearingCarePlanDocument(EarlyHearingCarePlanDocument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRiskIndicatorsForHearingLossSection(RiskIndicatorsForHearingLossSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Screening Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Screening Coded Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHearingScreeningCodedResultsSection(HearingScreeningCodedResultsSection object)
  {
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
  public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Document</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMedicalDocument(MedicalDocument object)
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
  public T caseSection(Section object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coded Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCodedResultsSection(CodedResultsSection object)
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
  public T defaultCase(EObject object)
  {
		return null;
	}

} //QrphSwitch
