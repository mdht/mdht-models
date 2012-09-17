/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

//import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SocialHistorySectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Social History Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocialHistorySectionImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistorySectionImpl
		implements SocialHistorySection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolSocialHistorySectionSmokingStatusObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateMu2consolSocialHistorySectionSmokingStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmokingStatusObservation> getMu2consolSmokingStatusObservations() {
		return SocialHistorySectionOperations.getMu2consolSmokingStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SocialHistorySection init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // SocialHistorySectionImpl
