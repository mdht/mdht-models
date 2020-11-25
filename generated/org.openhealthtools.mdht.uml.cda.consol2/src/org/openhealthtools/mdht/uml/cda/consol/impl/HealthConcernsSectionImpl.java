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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Concerns Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HealthConcernsSectionImpl extends SectionImpl implements HealthConcernsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthConcernsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_CONCERNS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionHealthConcernAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionHealthConcernAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionHealthStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionHealthStatusObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernsSectionRiskConcernAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernsSectionOperations.validateHealthConcernsSectionRiskConcernAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthConcernAct> getHealthConcernActs() {
		return HealthConcernsSectionOperations.getHealthConcernActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthStatusObservation2> getHealthStatusObservation2s() {
		return HealthConcernsSectionOperations.getHealthStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskConcernAct> getRiskConcernActs() {
		return HealthConcernsSectionOperations.getRiskConcernActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthConcernsSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HealthConcernsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HealthConcernsSectionImpl
