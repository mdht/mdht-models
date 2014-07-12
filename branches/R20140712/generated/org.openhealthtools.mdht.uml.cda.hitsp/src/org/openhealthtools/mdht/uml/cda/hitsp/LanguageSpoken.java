/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.LanguageCommunication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Spoken</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getLanguageSpoken()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='LanguageSpokenTemplateId LanguageSpokenModeCode' templateId.root='2.16.840.1.113883.3.88.11.83.2' constraints.validation.warning='LanguageSpokenNoProficiencyLevelCode' modeCode.codeSystem='2.16.840.1.113883.5.60' modeCode.codeSystemName='LanguageAbilityMode'"
 * @generated
 */
public interface LanguageSpoken extends LanguageCommunication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.2\')'"
	 * @generated
	 */
	boolean validateLanguageSpokenTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.60\' and (value.code = \'ESGN\' or value.code = \'ESP\' or value.code = \'EWR\' or value.code = \'RSGN\' or value.code = \'RSP\' or value.code = \'RWR\'))'"
	 * @generated
	 */
	boolean validateLanguageSpokenModeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSpoken init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSpoken init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // LanguageSpoken
