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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationsNarrativeSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunizations Narrative Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationsNarrativeSectionImpl extends SectionImpl implements ImmunizationsNarrativeSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationsNarrativeSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATIONS_NARRATIVE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsNarrativeSectionOperations.validateImmunizationsNarrativeSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsNarrativeSectionOperations.validateImmunizationsNarrativeSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsNarrativeSectionOperations.validateImmunizationsNarrativeSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsNarrativeSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsNarrativeSectionOperations.validateImmunizationsNarrativeSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsNarrativeSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ImmunizationsNarrativeSectionImpl
