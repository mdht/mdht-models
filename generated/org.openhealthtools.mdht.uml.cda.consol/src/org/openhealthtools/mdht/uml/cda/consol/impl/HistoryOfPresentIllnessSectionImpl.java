/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryOfPresentIllnessSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Of Present Illness Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryOfPresentIllnessSectionImpl extends SectionImpl implements HistoryOfPresentIllnessSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryOfPresentIllnessSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_OF_PRESENT_ILLNESS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllnessSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllnessSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllnessSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllnessSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPresentIllnessSectionOperations.validateHistoryOfPresentIllnessSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} // HistoryOfPresentIllnessSectionImpl
