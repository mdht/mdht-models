/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.NeurologicSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.NeurologicSystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neurologic System Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NeurologicSystemSectionImpl extends SectionImpl implements NeurologicSystemSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeurologicSystemSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.NEUROLOGIC_SYSTEM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicSystemSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicSystemSectionOperations.validateNeurologicSystemSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicSystemSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicSystemSectionOperations.validateNeurologicSystemSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicSystemSectionProblemEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicSystemSectionOperations.validateNeurologicSystemSectionProblemEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry getProblemEntry() {
		return NeurologicSystemSectionOperations.getProblemEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurologicSystemSection init() {
		CDAUtil.init(this);
		return this;
	}
} // NeurologicSystemSectionImpl