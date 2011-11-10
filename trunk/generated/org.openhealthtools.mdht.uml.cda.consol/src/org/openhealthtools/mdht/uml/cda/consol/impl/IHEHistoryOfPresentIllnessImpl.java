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
import org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.operations.IHEHistoryOfPresentIllnessOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IHE History Of Present Illness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IHEHistoryOfPresentIllnessImpl extends SectionImpl implements IHEHistoryOfPresentIllness {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IHEHistoryOfPresentIllnessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IHE_HISTORY_OF_PRESENT_ILLNESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHEHistoryOfPresentIllnessTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IHEHistoryOfPresentIllnessOperations.validateIHEHistoryOfPresentIllnessTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHEHistoryOfPresentIllnessCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IHEHistoryOfPresentIllnessOperations.validateIHEHistoryOfPresentIllnessCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEHistoryOfPresentIllness init() {
		CDAUtil.init(this);
		return this;
	}
} // IHEHistoryOfPresentIllnessImpl
