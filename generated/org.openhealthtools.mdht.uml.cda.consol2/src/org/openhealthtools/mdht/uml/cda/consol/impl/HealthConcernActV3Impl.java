/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3;

import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernActV3Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Concern Act V3</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HealthConcernActV3Impl extends ActImpl implements HealthConcernActV3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthConcernActV3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActV3TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActV3Operations.validateHealthConcernActV3TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActV3Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActV3Operations.validateHealthConcernActV3Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActV3StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActV3Operations.validateHealthConcernActV3StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActV3StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActV3Operations.validateHealthConcernActV3StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActV3EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActV3Operations.validateHealthConcernActV3EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActV3ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActV3Operations.validateHealthConcernActV3ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActV3MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActV3Operations.validateHealthConcernActV3MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthConcernActV3 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthConcernActV3 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HealthConcernActV3Impl
