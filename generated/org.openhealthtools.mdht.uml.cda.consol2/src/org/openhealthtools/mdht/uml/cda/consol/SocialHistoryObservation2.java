/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social History Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSocialHistoryObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SocialHistoryObservation2TemplateId SocialHistoryObservation2IfNotLoincRequireTranslation SocialHistoryObservationCodeP SocialHistoryObservationStatusCode SocialHistoryObservationStatusCodeP SocialHistoryObservation2EffectiveTime' templateId.root='2.16.840.1.113883.10.20.22.4.38' templateId.extension='2015-08-01' constraints.validation.warning='SocialHistoryObservation2ReferenceAttribute SocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc SocialHistoryObservationCode SocialHistoryObservationValue SocialHistoryObservation2AuthorParticipation' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.dependOn.SocialHistoryObservationStatusCode='SocialHistoryObservationStatusCodeP' constraints.validation.info='SocialHistoryObservation2CDTranslation SocialHistoryObservation2CDTranslationP' constraints.validation.query='SocialHistoryObservation2CDTranslation SocialHistoryObservation2CDTranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSocialHistoryObservation2CD constraints.validation.info='SocialHistoryObservation2CDTranslation SocialHistoryObservation2CDTranslationP'"
 *        annotation="duplicates"
 * @generated
 */
public interface SocialHistoryObservation2 extends SocialHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.originalText.oclIsUndefined() implies not self.code.originalText.reference.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2ReferenceAttribute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='code.codeSystem &lt;&gt; \'2.16.840.1.113883.6.1\' implies code.translation-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2IfNotLoincRequireTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='code.codeSystem &lt;&gt; \'2.16.840.1.113883.6.1\' and code.translation-&gt;size() &gt;= 1 implies code.translation-&gt;forAll(trans : datatypes::CD | trans.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.38\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSocialHistoryObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (not translation-&gt;isEmpty() and translation-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) )))'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not translation-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateSocialHistoryObservation2CDTranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SocialHistoryObservation2
