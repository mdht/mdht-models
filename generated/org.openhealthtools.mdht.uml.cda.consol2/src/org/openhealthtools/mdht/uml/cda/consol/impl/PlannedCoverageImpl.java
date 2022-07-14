/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedCoverageOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedCoverageImpl extends ActImpl implements PlannedCoverage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipActClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipActMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipActId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipActCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipActCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipActStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipActStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedCoverageEntryRelationshipAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedCoverage init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PlannedCoverage init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PlannedCoverageImpl
