/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.apitest.domain.*;

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
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSwitch() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
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
			case DomainPackage.ISTATUS_OBSERVATION: {
				IStatusObservation iStatusObservation = (IStatusObservation)theEObject;
				T result = caseIStatusObservation(iStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ICONDITION: {
				ICondition iCondition = (ICondition)theEObject;
				T result = caseICondition(iCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IEPISODE_OBSERVATION: {
				IEpisodeObservation iEpisodeObservation = (IEpisodeObservation)theEObject;
				T result = caseIEpisodeObservation(iEpisodeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IPROBLEM_ENTRY: {
				IProblemEntry iProblemEntry = (IProblemEntry)theEObject;
				T result = caseIProblemEntry(iProblemEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IAGE_OBSERVATION: {
				IAgeObservation iAgeObservation = (IAgeObservation)theEObject;
				T result = caseIAgeObservation(iAgeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ISEVERITY: {
				ISeverity iSeverity = (ISeverity)theEObject;
				T result = caseISeverity(iSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IPROBLEM_STATUS_OBSERVATION: {
				IProblemStatusObservation iProblemStatusObservation = (IProblemStatusObservation)theEObject;
				T result = caseIProblemStatusObservation(iProblemStatusObservation);
				if (result == null) result = caseIStatusObservation(iProblemStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IHEALTH_STATUS_OBSERVATION: {
				IHealthStatusObservation iHealthStatusObservation = (IHealthStatusObservation)theEObject;
				T result = caseIHealthStatusObservation(iHealthStatusObservation);
				if (result == null) result = caseIStatusObservation(iHealthStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ICOMMENT: {
				IComment iComment = (IComment)theEObject;
				T result = caseIComment(iComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ICAUSE_OF_DEATH_OBSERVATION: {
				ICauseOfDeathObservation iCauseOfDeathObservation = (ICauseOfDeathObservation)theEObject;
				T result = caseICauseOfDeathObservation(iCauseOfDeathObservation);
				if (result == null) result = caseIFamilyHistoryObservation(iCauseOfDeathObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IFAMILY_HISTORY_OBSERVATION: {
				IFamilyHistoryObservation iFamilyHistoryObservation = (IFamilyHistoryObservation)theEObject;
				T result = caseIFamilyHistoryObservation(iFamilyHistoryObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ITREATING_PROVIDER: {
				ITreatingProvider iTreatingProvider = (ITreatingProvider)theEObject;
				T result = caseITreatingProvider(iTreatingProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IPROBLEM_LIST_SECTION: {
				IProblemListSection iProblemListSection = (IProblemListSection)theEObject;
				T result = caseIProblemListSection(iProblemListSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IPATIENT_SUMMARY: {
				IPatientSummary iPatientSummary = (IPatientSummary)theEObject;
				T result = caseIPatientSummary(iPatientSummary);
				if (result == null) result = caseIGeneralHeaderConstraints(iPatientSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IGENERAL_HEADER_CONSTRAINTS: {
				IGeneralHeaderConstraints iGeneralHeaderConstraints = (IGeneralHeaderConstraints)theEObject;
				T result = caseIGeneralHeaderConstraints(iGeneralHeaderConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStatus Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStatus Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStatusObservation(IStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICondition(ICondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEpisode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEpisode Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEpisodeObservation(IEpisodeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProblem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProblem Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProblemEntry(IProblemEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAge Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAge Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAgeObservation(IAgeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISeverity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISeverity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISeverity(ISeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProblem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProblem Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProblemStatusObservation(IProblemStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHealth Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHealth Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHealthStatusObservation(IHealthStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IComment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IComment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIComment(IComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICause Of Death Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICauseOfDeathObservation(ICauseOfDeathObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFamily History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFamily History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFamilyHistoryObservation(IFamilyHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITreating Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITreating Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITreatingProvider(ITreatingProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProblem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProblem List Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProblemListSection(IProblemListSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPatient Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPatientSummary(IPatientSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGeneral Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGeneral Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGeneralHeaderConstraints(IGeneralHeaderConstraints object) {
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

} //DomainSwitch
