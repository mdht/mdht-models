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

import org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSSocialHistorySectionImpl extends SectionImpl implements EMSSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSSocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSocialHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSocialHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSocialHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSocialHistorySectionExistenceOfDrugUseIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionExistenceOfDrugUseIndication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSocialHistorySectionDrugUseIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionDrugUseIndication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugUseIndication getExistenceOfDrugUseIndication() {
		return EMSSocialHistorySectionOperations.getExistenceOfDrugUseIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugUseIndication getDrugUseIndication() {
		return EMSSocialHistorySectionOperations.getDrugUseIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSocialHistorySection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSocialHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSSocialHistorySectionImpl
