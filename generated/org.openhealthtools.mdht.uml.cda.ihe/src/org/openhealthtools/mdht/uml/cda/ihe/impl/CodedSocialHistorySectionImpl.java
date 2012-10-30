/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;

import org.openhealthtools.mdht.uml.cda.ccd.impl.SocialHistorySectionImpl;

import org.openhealthtools.mdht.uml.cda.ihe.CodedSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedSocialHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coded Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CodedSocialHistorySectionImpl extends SocialHistorySectionImpl implements CodedSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedSocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.CODED_SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSocialHistorySectionSocialHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CodedSocialHistorySectionOperations.validateCodedSocialHistorySectionSocialHistoryObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialHistoryObservation> getIHESocialHistoryObservations() {
		return CodedSocialHistorySectionOperations.getIHESocialHistoryObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodedSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodedSocialHistorySection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodedSocialHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CodedSocialHistorySectionImpl
