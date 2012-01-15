/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Performer1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Event1 Primary Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getServiceEvent1_PrimaryPerformer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PrimaryPerformerFunctionCode' functionCode.codeSystem='2.16.840.1.113883.6.101' functionCode.codeSystemName='NUCCHealthCareProviderTaxonomy'"
 * @generated
 */
public interface ServiceEvent1_PrimaryPerformer extends Performer1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (self.functionCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (self.functionCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in (\nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePrimaryPerformerFunctionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEvent1_PrimaryPerformer init();
} // ServiceEvent1_PrimaryPerformer
