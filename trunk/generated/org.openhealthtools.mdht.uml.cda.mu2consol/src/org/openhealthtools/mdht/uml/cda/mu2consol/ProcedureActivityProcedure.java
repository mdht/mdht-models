/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Procedure Activity Procedure</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getProcedureActivityProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolProcedureActivityProcedureTemplateId Mu2consolProcedureActivityProcedureCode' templateId.root='2.16.840.1.113883.10.20.22.4.14' constraints.validation.warning='Mu2consolProcedureActivityProcedureCodeValue'"
 * @generated
 */
public interface ProcedureActivityProcedure extends
		org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.96' xor self.code.codeSystem
	 * = '2.16.840.1.113883.6.12'
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code.codeSystem = \'2.16.840.1.113883.6.96\' xor self.code.codeSystem = \'2.16.840.1.113883.6.12\''"
	 * @generated
	 */
	boolean validateMu2consolProcedureActivityProcedureCodeValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies
	 * (not self.code.oclIsUndefined())
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMu2consolProcedureActivityProcedureCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedure init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public ProcedureActivityProcedure init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureActivityProcedure
