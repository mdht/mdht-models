/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.LanguageCommunication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Spoken</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getLanguageSpoken()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='LanguageSpokenModeCode' constraints.validation.warning='LanguageSpokenNoProficiencyLevelCode' modeCode.codeSystem='2.16.840.1.113883.5.60' modeCode.codeSystemName='LanguageAbilityMode'"
 * @generated
 */
public interface LanguageSpoken extends LanguageCommunication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.proficiencyLevelCode.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.proficiencyLevelCode.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateLanguageSpokenNoProficiencyLevelCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (self.modeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (self.modeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in (\nvalue.codeSystem = \'2.16.840.1.113883.5.60\' and (value.code = \'ESGN\' or value.code = \'ESP\' or value.code = \'EWR\' or value.code = \'RSGN\' or value.code = \'RSP\' or value.code = \'RWR\')))'"
	 * @generated
	 */
	boolean validateLanguageSpokenModeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSpoken init();
} // LanguageSpoken
