/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusEvaluationsAndOutcomesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Status Evaluations And Outcomes Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HealthStatusEvaluationsAndOutcomesSectionImpl extends SectionImpl
		implements HealthStatusEvaluationsAndOutcomesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusEvaluationsAndOutcomesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusEvaluationsAndOutcomesSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusEvaluationsAndOutcomesSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusEvaluationsAndOutcomesSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusEvaluationsAndOutcomesSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutcomeObservation> getOutcomeObservations() {
		return HealthStatusEvaluationsAndOutcomesSectionOperations.getOutcomeObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusEvaluationsAndOutcomesSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HealthStatusEvaluationsAndOutcomesSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HealthStatusEvaluationsAndOutcomesSectionImpl
