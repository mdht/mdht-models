/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AbdomenAssessmentOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abdomen Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AbdomenAssessmentImpl extends ObservationImpl implements AbdomenAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbdomenAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ABDOMEN_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbdomenAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbdomenAssessmentOperations.validateAbdomenAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbdomenAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbdomenAssessmentOperations.validateAbdomenAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbdomenAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbdomenAssessmentOperations.validateAbdomenAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbdomenAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbdomenAssessmentOperations.validateAbdomenAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbdomenAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbdomenAssessmentOperations.validateAbdomenAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbdomenAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbdomenAssessmentOperations.validateAbdomenAssessmentTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbdomenAssessment init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbdomenAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AbdomenAssessmentImpl
