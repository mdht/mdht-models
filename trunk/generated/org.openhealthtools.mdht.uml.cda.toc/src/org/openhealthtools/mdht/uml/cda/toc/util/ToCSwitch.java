/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCPackage;
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
 * @see org.openhealthtools.mdht.uml.cda.toc.ToCPackage
 * @generated
 */
public class ToCSwitch<T> extends Switch<T> {
	/**
	* The cached model package
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected static ToCPackage modelPackage;

	/**
	* Creates an instance of the switch.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ToCSwitch() {
		if (modelPackage == null) {
			modelPackage = ToCPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ToCPackage.DISCHARGE_SUMMARY: {
				DischargeSummary dischargeSummary = (DischargeSummary) theEObject;
				T result = caseDischargeSummary(dischargeSummary);
				if (result == null) {
					result = caseGeneralHeaderConstraints(dischargeSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(dischargeSummary);
				}
				if (result == null) {
					result = caseAct(dischargeSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ToCPackage.DISCHARGE_INSTRUCTIONS: {
				DischargeInstructions dischargeInstructions = (DischargeInstructions) theEObject;
				T result = caseDischargeInstructions(dischargeInstructions);
				if (result == null) {
					result = caseGeneralHeaderConstraints(dischargeInstructions);
				}
				if (result == null) {
					result = caseClinicalDocument(dischargeInstructions);
				}
				if (result == null) {
					result = caseAct(dischargeInstructions);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeInstructions);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ToCPackage.CONSULTATION_SUMMARY: {
				ConsultationSummary consultationSummary = (ConsultationSummary) theEObject;
				T result = caseConsultationSummary(consultationSummary);
				if (result == null) {
					result = caseGeneralHeaderConstraints(consultationSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(consultationSummary);
				}
				if (result == null) {
					result = caseAct(consultationSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(consultationSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ToCPackage.CONSULTATION_REQUEST: {
				ConsultationRequest consultationRequest = (ConsultationRequest) theEObject;
				T result = caseConsultationRequest(consultationRequest);
				if (result == null) {
					result = caseGeneralHeaderConstraints(consultationRequest);
				}
				if (result == null) {
					result = caseClinicalDocument(consultationRequest);
				}
				if (result == null) {
					result = caseAct(consultationRequest);
				}
				if (result == null) {
					result = caseInfrastructureRoot(consultationRequest);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseDischargeSummary(DischargeSummary object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Discharge Instructions</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Discharge Instructions</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseDischargeInstructions(DischargeInstructions object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Consultation Summary</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Consultation Summary</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseConsultationSummary(ConsultationSummary object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Consultation Request</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Consultation Request</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseConsultationRequest(ConsultationRequest object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} // ToCSwitch
