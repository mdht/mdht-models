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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.MusculoskeletalSystemSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Musculoskeletal System Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MusculoskeletalSystemSectionImpl extends SectionImpl implements MusculoskeletalSystemSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusculoskeletalSystemSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMusculoskeletalSystemSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MusculoskeletalSystemSectionOperations.validateMusculoskeletalSystemSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMusculoskeletalSystemSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MusculoskeletalSystemSectionOperations.validateMusculoskeletalSystemSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMusculoskeletalSystemSectionProblemEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MusculoskeletalSystemSectionOperations.validateMusculoskeletalSystemSectionProblemEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation getProblemEntry() {
		return MusculoskeletalSystemSectionOperations.getProblemEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusculoskeletalSystemSection init() {
		CDAUtil.init(this);
		return this;
	}
} // MusculoskeletalSystemSectionImpl
