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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.OtherSymptomsOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Symptoms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OtherSymptomsImpl extends ObservationImpl implements OtherSymptoms {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherSymptomsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.OTHER_SYMPTOMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSymptomsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherSymptomsOperations.validateOtherSymptomsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSymptomsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherSymptomsOperations.validateOtherSymptomsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSymptomsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherSymptomsOperations.validateOtherSymptomsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSymptomsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherSymptomsOperations.validateOtherSymptomsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSymptomsValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherSymptomsOperations.validateOtherSymptomsValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSymptomsValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OtherSymptomsOperations.validateOtherSymptomsValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSymptoms init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSymptoms init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // OtherSymptomsImpl
