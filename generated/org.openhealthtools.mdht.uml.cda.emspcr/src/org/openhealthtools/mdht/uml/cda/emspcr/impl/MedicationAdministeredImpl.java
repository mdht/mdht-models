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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationAdministeredOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administered</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicationAdministeredImpl extends org.eclipse.mdht.uml.cda.impl.SubstanceAdministrationImpl implements MedicationAdministered {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationAdministeredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MEDICATION_ADMINISTERED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredMedicationConsumable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredMedicationConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredResponseRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredResponseRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredMedicationComplicationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredMedicationComplicationRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredMedicationPriorAdministrationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredMedicationPriorAdministrationRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredMedicationPerformerParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredMedicationPerformerParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredMedicationAuthorizationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredMedicationAuthorizationRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredMedicationAdministrationDeviceParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredMedicationAdministrationDeviceParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredApproachSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministeredRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationAdministeredOperations.validateMedicationAdministeredRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministered init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MedicationAdministered init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // MedicationAdministeredImpl
