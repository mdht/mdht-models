/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.PronouncingDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pronouncing Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PronouncingDeathImpl extends ObservationImpl implements PronouncingDeath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PronouncingDeathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsdrPackage.Literals.PRONOUNCING_DEATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerPronouncerRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerPronouncerRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePronouncingDeathPronouncerPronouncerRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PronouncingDeath init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PronouncingDeath init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PronouncingDeathImpl
