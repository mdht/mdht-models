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
import org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PrimarySymptomOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Symptom</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrimarySymptomImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PrimarySymptom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimarySymptomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PRIMARY_SYMPTOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimarySymptomTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimarySymptomOperations.validatePrimarySymptomTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimarySymptomMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimarySymptomOperations.validatePrimarySymptomMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimarySymptomCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimarySymptomOperations.validatePrimarySymptomCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimarySymptomCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimarySymptomOperations.validatePrimarySymptomCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimarySymptomValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimarySymptomOperations.validatePrimarySymptomValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimarySymptomValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimarySymptomOperations.validatePrimarySymptomValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimarySymptom init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrimarySymptom init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PrimarySymptomImpl
