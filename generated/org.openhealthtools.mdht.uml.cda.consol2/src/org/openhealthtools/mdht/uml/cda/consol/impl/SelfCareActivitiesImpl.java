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

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;

import org.openhealthtools.mdht.uml.cda.consol.operations.SelfCareActivitiesOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Care Activities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SelfCareActivitiesImpl extends ObservationImpl implements SelfCareActivities {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfCareActivitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SELF_CARE_ACTIVITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSelfCareActivitiesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSelfCareActivitiesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSelfCareActivitiesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSelfCareActivitiesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSelfCareActivitiesCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfCareActivitiesStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfCareActivitiesStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfCareActivitiesEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSelfCareActivitiesValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSelfCareActivitiesValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfCareActivitiesAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SelfCareActivitiesOperations.validateSelfCareActivitiesAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfCareActivities init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfCareActivities init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SelfCareActivitiesImpl
