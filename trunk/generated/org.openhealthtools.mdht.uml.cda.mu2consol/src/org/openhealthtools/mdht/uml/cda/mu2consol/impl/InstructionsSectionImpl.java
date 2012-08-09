/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.InstructionsSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instructions Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class InstructionsSectionImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.InstructionsSectionImpl
		implements InstructionsSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstructionsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.INSTRUCTIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolInstructionsSectionInstructions(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InstructionsSectionOperations
				.validateMu2consolInstructionsSectionInstructions(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Instructions> getmu2consolInstructionss() {
		return InstructionsSectionOperations.getmu2consolInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public InstructionsSection init() {
		CDAUtil.init(this);
		return this;
	}
} // InstructionsSectionImpl
