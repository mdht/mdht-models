/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CurrentlyOnMedicationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currently On Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CurrentlyOnMedicationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements CurrentlyOnMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentlyOnMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CURRENTLY_ON_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentlyOnMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentlyOnMedicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentlyOnMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentlyOnMedicationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentlyOnMedication init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CurrentlyOnMedication init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // CurrentlyOnMedicationImpl
